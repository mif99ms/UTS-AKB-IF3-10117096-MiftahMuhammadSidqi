package droidmentor.bnv_with_viewpager;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;

import java.io.ByteArrayOutputStream;

/**
 * TANGGAL PENGERJAAN: 10 MEI 2020
 * NIM: 10117096
 * NAMA: MIFTAH MUHAMMAD SIDQI
 * KELAS: IF-3
 */

public class BitmapUtility {

    // convert from bitmap to byte array
    public static byte[] getBytes(Bitmap bitmap) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, stream);
        return stream.toByteArray();
    }

    // convert from byte array to bitmap
    public static Bitmap getImage(byte[] image) {
        return BitmapFactory.decodeByteArray(image, 0, image.length);
    }

    public static RoundedBitmapDrawable setBitmapCircular(Resources res, Bitmap bitmap) {
        RoundedBitmapDrawable dr = RoundedBitmapDrawableFactory.create(res, bitmap);
        dr.setCircular(true);
        return (dr);
    }
}
