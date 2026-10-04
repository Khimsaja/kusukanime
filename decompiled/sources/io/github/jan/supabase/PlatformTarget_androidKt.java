package io.github.jan.supabase;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0002"}, d2 = {"getOSInformation", "Lio/github/jan/supabase/OSInformation;", "supabase-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlatformTarget_androidKt {
    public static final OSInformation getOSInformation() {
        String str = Build.VERSION.RELEASE;
        l.e("RELEASE", str);
        return new OSInformation("Android", str);
    }
}
