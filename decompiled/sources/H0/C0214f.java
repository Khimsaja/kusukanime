package H0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: H0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214f implements CharSequence {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3110b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3111c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3112d;

    static {
        L2.e eVar = A.a;
    }

    public C0214f(String str, List list, List list2, List list3) {
        this.a = str;
        this.f3110b = list;
        this.f3111c = list2;
        this.f3112d = list3;
        if (list2 != null) {
            List listO0 = P3.q.O0(list2, new C0213e());
            int size = listO0.size();
            int i7 = -1;
            int i8 = 0;
            while (i8 < size) {
                C0212d c0212d = (C0212d) listO0.get(i8);
                if (c0212d.f3107b < i7) {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap");
                }
                int length = this.a.length();
                int i9 = c0212d.f3108c;
                if (i9 > length) {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + c0212d.f3107b + ", " + i9 + ") is out of boundary").toString());
                }
                i8++;
                i7 = i9;
            }
        }
    }

    public final List a() {
        List list = this.f3110b;
        return list == null ? P3.y.f7779k : list;
    }

    @Override // java.lang.CharSequence
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0214f subSequence(int i7, int i8) {
        if (i7 > i8) {
            throw new IllegalArgumentException(("start (" + i7 + ") should be less or equal to end (" + i8 + ')').toString());
        }
        String str = this.a;
        if (i7 == 0 && i8 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i7, i8);
        kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return new C0214f(strSubstring, AbstractC0215g.a(i7, i8, this.f3110b), AbstractC0215g.a(i7, i8, this.f3111c), AbstractC0215g.a(i7, i8, this.f3112d));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.a.charAt(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0214f)) {
            return false;
        }
        C0214f c0214f = (C0214f) obj;
        return kotlin.jvm.internal.l.a(this.a, c0214f.a) && kotlin.jvm.internal.l.a(this.f3110b, c0214f.f3110b) && kotlin.jvm.internal.l.a(this.f3111c, c0214f.f3111c) && kotlin.jvm.internal.l.a(this.f3112d, c0214f.f3112d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.f3110b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f3111c;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.f3112d;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [P3.y] */
    public C0214f(String str, ArrayList arrayList, int i7) {
        arrayList = (i7 & 2) != 0 ? P3.y.f7779k : arrayList;
        this(str, arrayList.isEmpty() ? null : arrayList, null, null);
    }
}
