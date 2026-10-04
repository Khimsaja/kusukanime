package p1;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import p.I0;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1779b extends I0 {
    @Override // p.I0
    public final Signature[] v(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
