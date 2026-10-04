package n0;

import f6.AbstractC0905c;
import h0.C0975U;
import h0.C0998u;
import java.util.ArrayList;

/* renamed from: n0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1537d {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13143b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13144c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13145d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13146e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13147f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13148g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13149h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f13150i;

    /* renamed from: j, reason: collision with root package name */
    public final C1536c f13151j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13152k;

    public C1537d(String str, boolean z7) {
        long j7 = C0998u.f11834g;
        this.a = str;
        this.f13143b = 24.0f;
        this.f13144c = 24.0f;
        this.f13145d = 24.0f;
        this.f13146e = 24.0f;
        this.f13147f = j7;
        this.f13148g = 5;
        this.f13149h = z7;
        ArrayList arrayList = new ArrayList();
        this.f13150i = arrayList;
        int i7 = AbstractC1530A.a;
        P3.y yVar = P3.y.f7779k;
        ArrayList arrayList2 = new ArrayList();
        C1536c c1536c = new C1536c();
        c1536c.a = yVar;
        c1536c.f13142b = arrayList2;
        this.f13151j = c1536c;
        arrayList.add(c1536c);
    }

    public static void a(C1537d c1537d, ArrayList arrayList, C0975U c0975u) {
        if (c1537d.f13152k) {
            AbstractC0905c.C("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            throw null;
        }
        ((C1536c) c1537d.f13150i.get(r1.size() - 1)).f13142b.add(new C1533D(arrayList, c0975u));
    }

    public final C1538e b() {
        if (this.f13152k) {
            AbstractC0905c.C("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            throw null;
        }
        while (true) {
            ArrayList arrayList = this.f13150i;
            if (arrayList.size() <= 1) {
                C1536c c1536c = this.f13151j;
                c1536c.getClass();
                C1538e c1538e = new C1538e(this.a, this.f13143b, this.f13144c, this.f13145d, this.f13146e, new C1559z(c1536c.a, c1536c.f13142b), this.f13147f, this.f13148g, this.f13149h);
                this.f13152k = true;
                return c1538e;
            }
            if (this.f13152k) {
                AbstractC0905c.C("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                throw null;
            }
            C1536c c1536c2 = (C1536c) arrayList.remove(arrayList.size() - 1);
            ArrayList arrayList2 = ((C1536c) arrayList.get(arrayList.size() - 1)).f13142b;
            c1536c2.getClass();
            arrayList2.add(new C1559z(c1536c2.a, c1536c2.f13142b));
        }
    }
}
