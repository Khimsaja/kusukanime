package android.support.v4.media;

import G2.C0175l;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0175l(8);

    /* renamed from: k, reason: collision with root package name */
    public final int f10506k;

    /* renamed from: l, reason: collision with root package name */
    public final float f10507l;

    public RatingCompat(float f5, int i7) {
        this.f10506k = i7;
        this.f10507l = f5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f10506k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f10506k);
        sb.append(" rating=");
        float f5 = this.f10507l;
        sb.append(f5 < 0.0f ? "unrated" : String.valueOf(f5));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f10506k);
        parcel.writeFloat(this.f10507l);
    }
}
