package Q1;

import B1.AbstractC0015b;
import y1.Q;

/* loaded from: classes.dex */
public final class r {
    public final Q a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f7938b;

    public r(Q q6, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC0015b.n("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = q6;
        this.f7938b = iArr;
    }
}
