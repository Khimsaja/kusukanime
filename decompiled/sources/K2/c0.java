package K2;

import G2.C0175l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new C0175l(3);

    /* renamed from: k, reason: collision with root package name */
    public int f4560k;

    /* renamed from: l, reason: collision with root package name */
    public int f4561l;

    /* renamed from: m, reason: collision with root package name */
    public int f4562m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f4563n;

    /* renamed from: o, reason: collision with root package name */
    public int f4564o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f4565p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f4566q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4567r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4568s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4569t;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f4560k);
        parcel.writeInt(this.f4561l);
        parcel.writeInt(this.f4562m);
        if (this.f4562m > 0) {
            parcel.writeIntArray(this.f4563n);
        }
        parcel.writeInt(this.f4564o);
        if (this.f4564o > 0) {
            parcel.writeIntArray(this.f4565p);
        }
        parcel.writeInt(this.f4567r ? 1 : 0);
        parcel.writeInt(this.f4568s ? 1 : 0);
        parcel.writeInt(this.f4569t ? 1 : 0);
        parcel.writeList(this.f4566q);
    }
}
