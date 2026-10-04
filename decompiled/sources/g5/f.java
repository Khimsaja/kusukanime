package g5;

import P3.y;
import b1.AbstractC0703b;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final m f11726c = new m();

    /* renamed from: d, reason: collision with root package name */
    public static final int f11727d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11728e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11729f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f11730g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f11731h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f11732i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f11733j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f11734k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f11735l;

    /* renamed from: m, reason: collision with root package name */
    public static final f f11736m;

    /* renamed from: n, reason: collision with root package name */
    public static final f f11737n;

    /* renamed from: o, reason: collision with root package name */
    public static final f f11738o;

    /* renamed from: p, reason: collision with root package name */
    public static final f f11739p;

    /* renamed from: q, reason: collision with root package name */
    public static final f f11740q;

    /* renamed from: r, reason: collision with root package name */
    public static final ArrayList f11741r;

    /* renamed from: s, reason: collision with root package name */
    public static final ArrayList f11742s;
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11743b;

    static {
        e eVar;
        int i7 = f11727d;
        int i8 = i7 << 1;
        f11728e = i7;
        int i9 = i7 << 2;
        f11729f = i8;
        int i10 = i7 << 3;
        f11730g = i9;
        int i11 = i7 << 4;
        f11731h = i10;
        int i12 = i7 << 5;
        f11732i = i11;
        f11733j = i12;
        f11727d = i7 << 7;
        int i13 = (i7 << 6) - 1;
        f11734k = i13;
        int i14 = i7 | i8 | i9;
        f11735l = i14;
        f11736m = new f(i13);
        f11737n = new f(i11 | i12);
        new f(i7);
        new f(i8);
        new f(i9);
        f11738o = new f(i14);
        new f(i10);
        f11739p = new f(i11);
        f11740q = new f(i12);
        new f(i8 | i11 | i12);
        Field[] fields = f.class.getFields();
        kotlin.jvm.internal.l.e("getFields(...)", fields);
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            e eVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            f fVar = obj instanceof f ? (f) obj : null;
            if (fVar != null) {
                String name = field2.getName();
                kotlin.jvm.internal.l.e("getName(...)", name);
                eVar2 = new e(fVar.f11743b, name);
            }
            if (eVar2 != null) {
                arrayList2.add(eVar2);
            }
        }
        f11741r = arrayList2;
        Field[] fields2 = f.class.getFields();
        kotlin.jvm.internal.l.e("getFields(...)", fields2);
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (kotlin.jvm.internal.l.a(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            Object obj2 = field4.get(null);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Int", obj2);
            int iIntValue = ((Integer) obj2).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                kotlin.jvm.internal.l.e("getName(...)", name2);
                eVar = new e(iIntValue, name2);
            } else {
                eVar = null;
            }
            if (eVar != null) {
                arrayList5.add(eVar);
            }
        }
        f11742s = arrayList5;
    }

    public f(int i7, List list) {
        kotlin.jvm.internal.l.f("excludes", list);
        this.a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i7 &= ~((d) it.next()).a();
        }
        this.f11743b = i7;
    }

    public final boolean a(int i7) {
        return (i7 & this.f11743b) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter", obj);
        f fVar = (f) obj;
        return kotlin.jvm.internal.l.a(this.a, fVar.a) && this.f11743b == fVar.f11743b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.f11743b;
    }

    public final String toString() throws IOException {
        Object next;
        Iterator it = f11741r.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((e) next).a == this.f11743b) {
                break;
            }
        }
        e eVar = (e) next;
        String strY0 = eVar != null ? eVar.f11725b : null;
        if (strY0 == null) {
            ArrayList arrayList = f11742s;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                e eVar2 = (e) it2.next();
                String str = a(eVar2.a) ? eVar2.f11725b : null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            strY0 = P3.q.y0(arrayList2, " | ", null, null, null, 62);
        }
        StringBuilder sbQ = AbstractC0703b.q("DescriptorKindFilter(", strY0, ", ");
        sbQ.append(this.a);
        sbQ.append(')');
        return sbQ.toString();
    }

    public /* synthetic */ f(int i7) {
        this(i7, y.f7779k);
    }
}
