package K5;

import H5.C0270k;

/* loaded from: classes.dex */
public final class O extends L5.d {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public C0270k f4773b;

    @Override // L5.d
    public final boolean a(L5.b bVar) {
        M m7 = (M) bVar;
        if (this.a >= 0) {
            return false;
        }
        long j7 = m7.f4767s;
        if (j7 < m7.f4768t) {
            m7.f4768t = j7;
        }
        this.a = j7;
        return true;
    }

    @Override // L5.d
    public final S3.c[] b(L5.b bVar) {
        long j7 = this.a;
        this.a = -1L;
        this.f4773b = null;
        return ((M) bVar).t(j7);
    }
}
