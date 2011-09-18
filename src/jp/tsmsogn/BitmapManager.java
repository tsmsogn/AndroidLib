package jp.tsmsogn;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class BitmapManager {

	public BitmapManager() {
	}

	public Bitmap getBitmap(String path, int width, int height) {
		BitmapFactory.Options options = new BitmapFactory.Options();
		options.inJustDecodeBounds = true;
		BitmapFactory.decodeFile(path, options);
		int scaleW = options.outWidth / width;
		int scaleH = options.outHeight / height;
		int scale = Math.max(scaleW, scaleH);
		options.inJustDecodeBounds = false;
		options.inSampleSize = scale;
		Bitmap bitmap = BitmapFactory.decodeFile(path, options);
		return bitmap;
	}

	public Bitmap getBitmapWithWidth(String path, int width) {
		BitmapFactory.Options options = new BitmapFactory.Options();
		options.inJustDecodeBounds = true;
		BitmapFactory.decodeFile(path, options);
		int scaleW = options.outWidth / width;
		options.inJustDecodeBounds = false;
		options.inSampleSize = scaleW;
		Bitmap bitmap = BitmapFactory.decodeFile(path, options);
		return bitmap;
	}

	public Bitmap getBitmapWithHeight(String path, int height) {
		BitmapFactory.Options options = new BitmapFactory.Options();
		options.inJustDecodeBounds = true;
		BitmapFactory.decodeFile(path, options);
		int scaleH = options.outHeight / height;
		options.inJustDecodeBounds = false;
		options.inSampleSize = scaleH;
		Bitmap bitmap = BitmapFactory.decodeFile(path, options);
		return bitmap;
	}

}
