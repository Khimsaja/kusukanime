package H5;

/* renamed from: H5.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0281w extends S3.a implements S3.e {

    /* renamed from: k, reason: collision with root package name */
    public static final C0280v f3886k = new C0280v(S3.d.f8766k, new A3.e(10));

    public AbstractC0281w() {
        super(S3.d.f8766k);
    }

    public abstract void W(S3.h hVar, Runnable runnable);

    public void X(S3.h hVar, Runnable runnable) {
        M5.a.i(this, hVar, runnable);
    }

    public boolean Y(S3.h hVar) {
        return !(this instanceof B0);
    }

    public AbstractC0281w Z(int i7) {
        M5.a.a(i7);
        return new M5.g(this, i7);
    }

    @Override // S3.a, S3.h
    public final S3.f get(S3.g gVar) {
        S3.f fVar;
        kotlin.jvm.internal.l.f("key", gVar);
        if (!(gVar instanceof C0280v)) {
            if (S3.d.f8766k == gVar) {
                return this;
            }
            return null;
        }
        C0280v c0280v = (C0280v) gVar;
        S3.g key = getKey();
        kotlin.jvm.internal.l.f("key", key);
        if ((key == c0280v || c0280v.f3885l == key) && (fVar = (S3.f) c0280v.f3884k.invoke(this)) != null) {
            return fVar;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[RETURN] */
    @Override // S3.a, S3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final S3.h minusKey(S3.g r4) {
        /*
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.l.f(r0, r4)
            boolean r1 = r4 instanceof H5.C0280v
            S3.i r2 = S3.i.f8767k
            if (r1 == 0) goto L27
            H5.v r4 = (H5.C0280v) r4
            S3.g r1 = r3.getKey()
            kotlin.jvm.internal.l.f(r0, r1)
            if (r1 == r4) goto L1c
            S3.g r0 = r4.f3885l
            if (r0 != r1) goto L1b
            goto L1c
        L1b:
            return r3
        L1c:
            e4.k r4 = r4.f3884k
            java.lang.Object r4 = r4.invoke(r3)
            S3.f r4 = (S3.f) r4
            if (r4 == 0) goto L2c
            goto L2b
        L27:
            S3.d r0 = S3.d.f8766k
            if (r0 != r4) goto L2c
        L2b:
            return r2
        L2c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.AbstractC0281w.minusKey(S3.g):S3.h");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + D.p(this);
    }
}
