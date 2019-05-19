package razerdp.github.com.lib.manager.compress;

import java.util.List;

/**
 * Created by liushaoming on 2018/1/8.
 */
public interface OnCompressListener {

    void onRotate(int picIndex, int width, int height);

    void onSuccess(List<String> imagePath);

    void onCompress(long current, long target);

    void onError(String tag);

    public static abstract class OnCompressListenerAdapter implements OnCompressListener {
        @Override
        public void onRotate(int picIndex, int width, int height) {

        }

        @Override
        public void onCompress(long current, long target) {

        }

        @Override
        public void onError(String tag) {

        }
    }
}
