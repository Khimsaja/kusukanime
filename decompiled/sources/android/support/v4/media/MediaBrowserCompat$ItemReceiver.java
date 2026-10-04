package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import b.C0699d;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends C0699d {
    @Override // b.C0699d
    public final void a(int i7, Bundle bundle) {
        if (bundle != null) {
            bundle = android.support.v4.media.session.b.N(bundle);
        }
        if (i7 != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
