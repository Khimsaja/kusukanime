package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a(3);

    /* renamed from: k, reason: collision with root package name */
    public int f10513k;

    /* renamed from: l, reason: collision with root package name */
    public int f10514l;

    /* renamed from: m, reason: collision with root package name */
    public int f10515m;

    /* renamed from: n, reason: collision with root package name */
    public int f10516n;

    /* renamed from: o, reason: collision with root package name */
    public int f10517o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f10513k);
        parcel.writeInt(this.f10515m);
        parcel.writeInt(this.f10516n);
        parcel.writeInt(this.f10517o);
        parcel.writeInt(this.f10514l);
    }
}
