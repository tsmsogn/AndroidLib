package jp.tsmsogn;

import android.os.Environment;

public class ExternalStrage {

	public ExternalStrage() {
	}

	/**
	 * 
	 * @return
	 */
	public boolean isAvailable() {
		String state = Environment.getExternalStorageState();
		if (Environment.MEDIA_MOUNTED.equals(state)
				|| Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isWriteable() {
		String state = Environment.getExternalStorageState();
		if (Environment.MEDIA_MOUNTED.equals(state)) {
			return true;
		}
		return false;
	}
	
}
