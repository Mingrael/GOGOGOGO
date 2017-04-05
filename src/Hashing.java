/**
 * Created by Миша on 05.04.2017.
 */
package com;

import java.math.BigInteger;
import java.security.*;
//Здесь мы хэшируем пароли пользователей.
    public class Hashing {
        public static String hash(String pass) throws NoSuchAlgorithmException {
            MessageDigest messageDigest;
            byte[] digest;

            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(pass.getBytes());
            digest = messageDigest.digest();

            BigInteger bigInt = new BigInteger(1, digest);
            String md5Hex = bigInt.toString(16);

            while (md5Hex.length() < 32) {
                md5Hex = "0" + md5Hex;
            }
            return md5Hex;
        }

        public static String salt() {
            SecureRandom random = new SecureRandom();
            BigInteger salt = new BigInteger(130, random);
            return salt.toString(32);
        }
    }

}
