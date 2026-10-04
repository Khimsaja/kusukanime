package I1;

import android.media.AudioProfile;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* bridge */ /* synthetic */ AudioProfile d(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* synthetic */ PlaybackMetrics.Builder f() {
        return new PlaybackMetrics.Builder();
    }

    public static /* synthetic */ PlaybackStateEvent.Builder g() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ ViewTranslationRequest.Builder k(AutofillId autofillId, long j7) {
        return new ViewTranslationRequest.Builder(autofillId, j7);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse m(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* synthetic */ void p() {
    }
}
