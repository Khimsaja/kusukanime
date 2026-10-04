package Q2;

import android.os.Parcel;
import android.util.SparseIntArray;
import b1.AbstractC0703b;
import m.C1484e;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f7946d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f7947e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7948f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7949g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7950h;

    /* renamed from: i, reason: collision with root package name */
    public int f7951i;

    /* renamed from: j, reason: collision with root package name */
    public int f7952j;

    /* renamed from: k, reason: collision with root package name */
    public int f7953k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1484e(0), new C1484e(0), new C1484e(0));
    }

    @Override // Q2.a
    public final b a() {
        Parcel parcel = this.f7947e;
        int iDataPosition = parcel.dataPosition();
        int i7 = this.f7952j;
        if (i7 == this.f7948f) {
            i7 = this.f7949g;
        }
        return new b(parcel, iDataPosition, i7, AbstractC0703b.m(new StringBuilder(), this.f7950h, "  "), this.a, this.f7944b, this.f7945c);
    }

    @Override // Q2.a
    public final boolean e(int i7) {
        while (this.f7952j < this.f7949g) {
            int i8 = this.f7953k;
            if (i8 == i7) {
                return true;
            }
            if (String.valueOf(i8).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            int i9 = this.f7952j;
            Parcel parcel = this.f7947e;
            parcel.setDataPosition(i9);
            int i10 = parcel.readInt();
            this.f7953k = parcel.readInt();
            this.f7952j += i10;
        }
        return this.f7953k == i7;
    }

    @Override // Q2.a
    public final void i(int i7) {
        int i8 = this.f7951i;
        SparseIntArray sparseIntArray = this.f7946d;
        Parcel parcel = this.f7947e;
        if (i8 >= 0) {
            int i9 = sparseIntArray.get(i8);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i9);
            parcel.writeInt(iDataPosition - i9);
            parcel.setDataPosition(iDataPosition);
        }
        this.f7951i = i7;
        sparseIntArray.put(i7, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i7);
    }

    public b(Parcel parcel, int i7, int i8, String str, C1484e c1484e, C1484e c1484e2, C1484e c1484e3) {
        super(c1484e, c1484e2, c1484e3);
        this.f7946d = new SparseIntArray();
        this.f7951i = -1;
        this.f7953k = -1;
        this.f7947e = parcel;
        this.f7948f = i7;
        this.f7949g = i8;
        this.f7952j = i7;
        this.f7950h = str;
    }
}
