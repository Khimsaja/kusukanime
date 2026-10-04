package b6;

/* renamed from: b6.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0732g {
    public final P3.l a = new P3.l();

    /* renamed from: b, reason: collision with root package name */
    public int f11020b;

    public final void a(char[] cArr) {
        kotlin.jvm.internal.l.f("array", cArr);
        synchronized (this) {
            int i7 = this.f11020b;
            if (cArr.length + i7 < AbstractC0729d.a) {
                this.f11020b = i7 + cArr.length;
                this.a.addLast(cArr);
            }
        }
    }

    public final char[] b(int i7) {
        char[] cArr;
        synchronized (this) {
            P3.l lVar = this.a;
            cArr = null;
            char[] cArr2 = (char[]) (lVar.isEmpty() ? null : lVar.removeLast());
            if (cArr2 != null) {
                this.f11020b -= cArr2.length;
                cArr = cArr2;
            }
        }
        return cArr == null ? new char[i7] : cArr;
    }
}
