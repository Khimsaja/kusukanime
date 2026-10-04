package K2;

import G2.C0175l;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: K2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317v implements Parcelable {
    public static final Parcelable.Creator<C0317v> CREATOR = new C0175l(1);

    /* renamed from: k, reason: collision with root package name */
    public int f4687k;

    /* renamed from: l, reason: collision with root package name */
    public int f4688l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4689m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f4687k);
        parcel.writeInt(this.f4688l);
        parcel.writeInt(this.f4689m ? 1 : 0);
    }
}
