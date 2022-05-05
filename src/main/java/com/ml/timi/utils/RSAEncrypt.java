package com.ml.timi.utils;

import com.sun.org.apache.xml.internal.security.utils.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.*;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class RSAEncrypt {

    /** 公钥文件名称 */
    private static final String PUBLIC_KEY_FILE = "public.key";
    /** 私钥文件名称 */
    private static final String PRIVATE_KEY_FILE = "private.key";
    /**
     * 字节数据转字符串专用集合
     */
    private static final char[] HEX_CHAR = {'0', '1', '2', '3', '4', '5', '6',
            '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    /** 密钥算法 */
    private static String KEY_ALGORITHM = "RSA";
    /** 密钥存放路径 */
    private static String KeyPair_PATH = "D:\\";

    /**
     * 随机生成密钥对
     */
    public static void genKeyPair(String filePath) {
        /** KeyPairGenerator 类用于生成公钥和私钥对，基于RSA算法生成对象 */
        KeyPairGenerator keyPairGen = null;
        try {
            keyPairGen = KeyPairGenerator.getInstance(KEY_ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        // 初始化密钥对生成器，密钥大小为96-1024位 16384最大
        /**
         * 一个字节是八个比特，即:1byte = 8bit。
         * 公钥长度 ：16384 bits最大
         * 明文最大长度 ： 16384 bits / 8 - 11 = 2037 byte
         *
         * */
        keyPairGen.initialize(16384, new SecureRandom());
        // 生成一个密钥对，保存在keyPair中
        KeyPair keyPair = keyPairGen.generateKeyPair();

        /**
         * RSAPrivateKey ：指定算法 RSA
         *
         * PublicKey ：可以是其他算法
         *
         * RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
         * RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
         * */
        //获取公钥
        PublicKey publicKey = keyPair.getPublic();
        //获取私钥
        PrivateKey privateKey = keyPair.getPrivate();
        try {
            // 得到公钥字符串
            String publicKeyString = Base64.encode(publicKey.getEncoded());
            // 得到私钥字符串
            String privateKeyString = Base64.encode(privateKey.getEncoded());
            // 将密钥对写入到文件
            FileWriter pubfw = new FileWriter(filePath + "/" + PUBLIC_KEY_FILE);
            FileWriter prifw = new FileWriter(filePath + "/" + PRIVATE_KEY_FILE);
            BufferedWriter pubbw = new BufferedWriter(pubfw);
            BufferedWriter pribw = new BufferedWriter(prifw);
            pubbw.write(publicKeyString);
            pribw.write(privateKeyString);
            pubbw.flush();
            pubbw.close();
            pubfw.close();
            pribw.flush();
            pribw.close();
            prifw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method               loadPublicKeyByFile
     * Description          方法描述
     *                      <从文件中输入流中加载公钥>
     * Author               Lin
     * Date                 2022/2/16 13:53
     * Version              1.0.0
     * @param               path    文件路径
     * @return java.lang.String     返回公钥
     */
    public static String loadPublicKeyByFile(String path) throws Exception {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path
                    + "/" + PUBLIC_KEY_FILE));
            String readLine = null;
            StringBuilder sb = new StringBuilder();
            while ((readLine = br.readLine()) != null) {
                sb.append(readLine);
            }
            br.close();

            return sb.toString();
        } catch (IOException e) {
            throw new Exception("公钥数据流读取错误");
        } catch (NullPointerException e) {
            throw new Exception("公钥输入流为空");
        }
    }

    /**
     * Method               loadPublicKeyByStr
     * Description          方法描述
     *                      <从字符串中加载公钥>
     * Author               Lin
     * Date                 2022/2/16 14:05
     * Version              1.0.0
     * @param           publicKeyStr   公钥字符串
     * @return java.security.PublicKey 返回公钥
     */
    public static PublicKey loadPublicKeyByStr(String publicKeyStr)
            throws Exception {
        try {
            byte[] buffer = Base64.decode(publicKeyStr);
            KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(buffer);
            return keyFactory.generatePublic(keySpec);
        } catch (NoSuchAlgorithmException e) {
            throw new Exception("无此算法");
        } catch (InvalidKeySpecException e) {
            throw new Exception("公钥非法");
        } catch (NullPointerException e) {
            throw new Exception("公钥数据为空");
        }
    }

    /**
     * Method               loadPrivateKeyByFile
     * Description          方法描述
     *                      <从文件中输入流中加载私钥>
     * Author               Lin
     * Date                 2022/2/16 13:53
     * Version              1.0.0
     * @param               path    文件路径
     * @return java.lang.String  返回私钥数据
     */
    public static String loadPrivateKeyByFile(String path) throws Exception {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path
                    + "/" + PRIVATE_KEY_FILE));
            String readLine = null;
            StringBuilder sb = new StringBuilder();
            while ((readLine = br.readLine()) != null) {
                sb.append(readLine);
            }
            br.close();
            return sb.toString();
        } catch (IOException e) {
            throw new Exception("私钥数据读取错误");
        } catch (NullPointerException e) {
            throw new Exception("私钥输入流为空");
        }
    }

    /**
     * Method               loadPrivateKeyByStr
     * Description          方法描述
     *                      <从字符串中加载私钥>
     * Author               Lin
     * Date                 2022/2/16 14:05
     * Version              1.0.0
     * @param           privateKeyStr   私钥数据字符串
     * @return java.security.PublicKey 返回私钥数据
     */
    public static PrivateKey loadPrivateKeyByStr(String privateKeyStr)
            throws Exception {
        try {
            byte[] buffer = Base64.decode(privateKeyStr);
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(buffer);
            KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
            return keyFactory.generatePrivate(keySpec);
        } catch (NoSuchAlgorithmException e) {
            throw new Exception("无此算法");
        } catch (InvalidKeySpecException e) {
            throw new Exception("私钥非法");
        } catch (NullPointerException e) {
            throw new Exception("私钥数据为空");
        }
    }

    /**
     * Method               encrypt
     * Description          方法描述
     *                      <公钥加密过程>
     * Author               Lin
     * Date                 2022/2/16 14:10
     * Version              1.0.0
     * @param           publicKey       公钥
     * @param           plainTextData   明文数据
     * @return byte[]       返回公钥加密数据
     */
    public static byte[] encrypt(PublicKey publicKey, byte[] plainTextData)
            throws Exception {
        if (publicKey == null) {
            throw new Exception("加密公钥为空, 请设置");
        }
        Cipher cipher = null;
        try {
            // 使用默认RSA
            cipher = Cipher.getInstance(KEY_ALGORITHM);
            // cipher= Cipher.getInstance(KEY_ALGORITHM, new BouncyCastleProvider());
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] output = cipher.doFinal(plainTextData);



            return output;
        } catch (NoSuchAlgorithmException e) {
            throw new Exception("无此加密算法");
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            return null;
        } catch (InvalidKeyException e) {
            throw new Exception("加密公钥非法,请检查");
        } catch (IllegalBlockSizeException e) {
            throw new Exception("明文长度非法");
        } catch (BadPaddingException e) {
            throw new Exception("明文数据已损坏");
        }
    }

    /**
     * Method               encrypt
     * Description          方法描述
     *                      <私钥加密过程>
     * Author               Lin
     * Date                 2022/2/16 14:10
     * Version              1.0.0
     * @param           privateKey       私钥
     * @param           plainTextData   明文数据
     * @return byte[]       返回私钥加密数据
     */
    public static byte[] encrypt(PrivateKey privateKey, byte[] plainTextData)
            throws Exception {
        if (privateKey == null) {
            throw new Exception("加密私钥为空, 请设置");
        }
        Cipher cipher = null;
        try {
            // 使用默认RSA
            cipher = Cipher.getInstance(KEY_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, privateKey);
            byte[] output = cipher.doFinal(plainTextData);
            return output;
        } catch (NoSuchAlgorithmException e) {
            throw new Exception("无此加密算法");
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            return null;
        } catch (InvalidKeyException e) {
            throw new Exception("加密私钥非法,请检查");
        } catch (IllegalBlockSizeException e) {
            throw new Exception("明文长度非法");
        } catch (BadPaddingException e) {
            throw new Exception("明文数据已损坏");
        }
    }


    /**
     * Method               decrypt
     * Description          方法描述
     *                      <公钥解密过程>
     * Author               Lin
     * Date                 2022/2/16 14:17
     * Version              1.0.0
     * @param           publicKey   公钥
     * @param           cipherData  密文数据
     * @return          byte[]      明文
     */
    public static byte[] decrypt(PublicKey publicKey, byte[] cipherData)
            throws Exception {
        if (publicKey == null) {
            throw new Exception("解密公钥为空, 请设置");
        }
        Cipher cipher = null;
        try {
            // 使用默认RSA
            cipher = Cipher.getInstance(KEY_ALGORITHM);
            // cipher= Cipher.getInstance(KEY_ALGORITHM, new BouncyCastleProvider());
            cipher.init(Cipher.DECRYPT_MODE, publicKey);
            byte[] output = cipher.doFinal(cipherData);
            return output;
        } catch (NoSuchAlgorithmException e) {
            throw new Exception("无此解密算法");
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            return null;
        } catch (InvalidKeyException e) {
            throw new Exception("解密公钥非法,请检查");
        } catch (IllegalBlockSizeException e) {
            throw new Exception("密文长度非法");
        } catch (BadPaddingException e) {
            throw new Exception("密文数据已损坏");
        }
    }

    /**
     * Method               decrypt
     * Description          方法描述
     *                      <私钥解密过程>
     * Author               Lin
     * Date                 2022/2/16 14:17
     * Version              1.0.0
     * @param           privateKey   私钥
     * @param           cipherData  密文数据
     * @return          byte[]      明文
     */
    public static byte[] decrypt(PrivateKey privateKey, byte[] cipherData)
            throws Exception {
        if (privateKey == null) {
            throw new Exception("解密私钥为空, 请设置");
        }
        Cipher cipher = null;
        try {
            // 使用默认RSA
            cipher = Cipher.getInstance(KEY_ALGORITHM);
            // cipher= Cipher.getInstance(KEY_ALGORITHM, new BouncyCastleProvider());
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] output = cipher.doFinal(cipherData);
            return output;
        } catch (NoSuchAlgorithmException e) {
            throw new Exception("无此解密算法");
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            return null;
        } catch (InvalidKeyException e) {
            throw new Exception("解密私钥非法,请检查");
        } catch (IllegalBlockSizeException e) {
            throw new Exception("密文长度非法");
        } catch (BadPaddingException e) {
            throw new Exception("密文数据已损坏");
        }
    }



    /**
     * 字节数据转十六进制字符串
     *
     * @param data
     *            输入数据
     * @return 十六进制内容
     */
    public static String byteArrayToString(byte[] data) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            // 取出字节的高四位 作为索引得到相应的十六进制标识符 注意无符号右移
            stringBuilder.append(HEX_CHAR[(data[i] & 0xf0) >>> 4]);
            // 取出字节的低四位 作为索引得到相应的十六进制标识符
            stringBuilder.append(HEX_CHAR[(data[i] & 0x0f)]);
            if (i < data.length - 1) {
                stringBuilder.append(' ');
            }
        }
        return stringBuilder.toString();
    }
}