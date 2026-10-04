package T2;

import b1.AbstractC0703b;
import d3.C0797i;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final w f9027b;

    /* renamed from: c, reason: collision with root package name */
    public final S2.f f9028c;

    public r(Object obj, w wVar, S2.f fVar) {
        this.a = obj;
        this.f9027b = wVar;
        this.f9028c = fVar;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this != obj) {
            if (obj instanceof r) {
                r rVar = (r) obj;
                Object obj2 = rVar.a;
                this.f9027b.getClass();
                Object obj3 = this.a;
                if (obj3 != obj2) {
                    if ((obj3 instanceof C0797i) && (obj2 instanceof C0797i)) {
                        C0797i c0797i = (C0797i) obj3;
                        C0797i c0797i2 = (C0797i) obj2;
                        if (!kotlin.jvm.internal.l.a(c0797i.a, c0797i2.a) || !c0797i.f11276b.equals(c0797i2.f11276b) || c0797i.f11278d != c0797i2.f11278d || !kotlin.jvm.internal.l.a(c0797i.f11280f, c0797i2.f11280f) || !kotlin.jvm.internal.l.a(c0797i.f11282h, c0797i2.f11282h) || c0797i.f11284j != c0797i2.f11284j || c0797i.f11285k != c0797i2.f11285k || c0797i.f11286l != c0797i2.f11286l || c0797i.f11287m != c0797i2.f11287m || c0797i.f11288n != c0797i2.f11288n || c0797i.f11289o != c0797i2.f11289o || c0797i.f11290p != c0797i2.f11290p || !c0797i.f11296v.equals(c0797i2.f11296v) || c0797i.f11297w != c0797i2.f11297w || c0797i.f11279e != c0797i2.f11279e || !c0797i.f11298x.equals(c0797i2.f11298x)) {
                            zA = false;
                        }
                    } else {
                        zA = kotlin.jvm.internal.l.a(obj3, obj2);
                    }
                    if (zA || !kotlin.jvm.internal.l.a(this.f9028c, rVar.f9028c)) {
                    }
                }
                zA = true;
                if (zA) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        this.f9027b.getClass();
        Object obj = this.a;
        if (obj instanceof C0797i) {
            C0797i c0797i = (C0797i) obj;
            int iHashCode2 = (c0797i.f11278d.hashCode() + ((c0797i.f11276b.hashCode() + (c0797i.a.hashCode() * 31)) * 923521)) * 961;
            c0797i.f11280f.getClass();
            iHashCode = c0797i.f11298x.f11316k.hashCode() + ((c0797i.f11279e.hashCode() + ((c0797i.f11297w.hashCode() + ((c0797i.f11296v.hashCode() + ((c0797i.f11290p.hashCode() + ((c0797i.f11289o.hashCode() + ((c0797i.f11288n.hashCode() + AbstractC0703b.d(AbstractC0703b.d(AbstractC0703b.d(AbstractC0703b.d((((1 + iHashCode2) * 31) + Arrays.hashCode(c0797i.f11282h.f11596k)) * 31, 31, c0797i.f11284j), 31, c0797i.f11285k), 31, c0797i.f11286l), 31, c0797i.f11287m)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return this.f9028c.hashCode() + (iHashCode * 31);
    }
}
