package H0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: H0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211c implements Appendable {
    public final StringBuilder a = new StringBuilder(16);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3104b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3105c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3106d = new ArrayList();

    public C0211c(C0214f c0214f) {
        new ArrayList();
        b(c0214f);
    }

    public final void a(B b4, int i7, int i8) {
        this.f3104b.add(new C0210b(i7, i8, b4));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C0214f) {
            b((C0214f) charSequence);
            return this;
        }
        this.a.append(charSequence);
        return this;
    }

    public final void b(C0214f c0214f) {
        StringBuilder sb = this.a;
        int length = sb.length();
        sb.append(c0214f.a);
        List list = c0214f.f3110b;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                C0212d c0212d = (C0212d) list.get(i7);
                a((B) c0212d.a, c0212d.f3107b + length, c0212d.f3108c + length);
            }
        }
        List list2 = c0214f.f3111c;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                C0212d c0212d2 = (C0212d) list2.get(i8);
                this.f3105c.add(new C0210b(c0212d2.f3107b + length, c0212d2.f3108c + length, (s) c0212d2.a));
            }
        }
        List list3 = c0214f.f3112d;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i9 = 0; i9 < size3; i9++) {
                C0212d c0212d3 = (C0212d) list3.get(i9);
                this.f3106d.add(new C0210b(c0212d3.a, c0212d3.f3107b + length, c0212d3.f3108c + length, c0212d3.f3109d));
            }
        }
    }

    public final C0214f c() {
        StringBuilder sb = this.a;
        String string = sb.toString();
        ArrayList arrayList = this.f3104b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList2.add(((C0210b) arrayList.get(i7)).a(sb.length()));
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        ArrayList arrayList3 = this.f3105c;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        for (int i8 = 0; i8 < size2; i8++) {
            arrayList4.add(((C0210b) arrayList3.get(i8)).a(sb.length()));
        }
        if (arrayList4.isEmpty()) {
            arrayList4 = null;
        }
        ArrayList arrayList5 = this.f3106d;
        ArrayList arrayList6 = new ArrayList(arrayList5.size());
        int size3 = arrayList5.size();
        for (int i9 = 0; i9 < size3; i9++) {
            arrayList6.add(((C0210b) arrayList5.get(i9)).a(sb.length()));
        }
        return new C0214f(string, arrayList2, arrayList4, arrayList6.isEmpty() ? null : arrayList6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i7, int i8) {
        ?? arrayList;
        ?? arrayList2;
        boolean z7 = charSequence instanceof C0214f;
        StringBuilder sb = this.a;
        if (z7) {
            C0214f c0214f = (C0214f) charSequence;
            int length = sb.length();
            sb.append((CharSequence) c0214f.a, i7, i8);
            List listB = AbstractC0215g.b(c0214f, i7, i8);
            if (listB != null) {
                int size = listB.size();
                for (int i9 = 0; i9 < size; i9++) {
                    C0212d c0212d = (C0212d) listB.get(i9);
                    a((B) c0212d.a, c0212d.f3107b + length, c0212d.f3108c + length);
                }
            }
            List list = null;
            String str = c0214f.a;
            if (i7 == i8 || (arrayList = c0214f.f3111c) == 0) {
                arrayList = 0;
            } else if (i7 != 0 || i8 < str.length()) {
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                int size2 = arrayList.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    Object obj = arrayList.get(i10);
                    C0212d c0212d2 = (C0212d) obj;
                    if (AbstractC0215g.c(i7, i8, c0212d2.f3107b, c0212d2.f3108c)) {
                        arrayList3.add(obj);
                    }
                }
                arrayList = new ArrayList(arrayList3.size());
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    C0212d c0212d3 = (C0212d) arrayList3.get(i11);
                    arrayList.add(new C0212d(e3.c.k(c0212d3.f3107b, i7, i8) - i7, e3.c.k(c0212d3.f3108c, i7, i8) - i7, c0212d3.a));
                }
            }
            if (arrayList != 0) {
                int size4 = arrayList.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    C0212d c0212d4 = (C0212d) arrayList.get(i12);
                    this.f3105c.add(new C0210b(c0212d4.f3107b + length, c0212d4.f3108c + length, (s) c0212d4.a));
                }
            }
            if (i7 != i8 && (arrayList2 = c0214f.f3112d) != 0) {
                if (i7 != 0 || i8 < str.length()) {
                    ArrayList arrayList4 = new ArrayList(arrayList2.size());
                    int size5 = arrayList2.size();
                    for (int i13 = 0; i13 < size5; i13++) {
                        Object obj2 = arrayList2.get(i13);
                        C0212d c0212d5 = (C0212d) obj2;
                        if (AbstractC0215g.c(i7, i8, c0212d5.f3107b, c0212d5.f3108c)) {
                            arrayList4.add(obj2);
                        }
                    }
                    arrayList2 = new ArrayList(arrayList4.size());
                    int size6 = arrayList4.size();
                    for (int i14 = 0; i14 < size6; i14++) {
                        C0212d c0212d6 = (C0212d) arrayList4.get(i14);
                        arrayList2.add(new C0212d(c0212d6.a, e3.c.k(c0212d6.f3107b, i7, i8) - i7, e3.c.k(c0212d6.f3108c, i7, i8) - i7, c0212d6.f3109d));
                    }
                }
                list = arrayList2;
            }
            if (list != null) {
                int size7 = list.size();
                for (int i15 = 0; i15 < size7; i15++) {
                    C0212d c0212d7 = (C0212d) list.get(i15);
                    this.f3106d.add(new C0210b(c0212d7.a, c0212d7.f3107b + length, c0212d7.f3108c + length, c0212d7.f3109d));
                }
            }
            return this;
        }
        sb.append(charSequence, i7, i8);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c2) {
        this.a.append(c2);
        return this;
    }
}
