package K2;

import G2.C0175l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new C0175l(2);

    /* renamed from: k, reason: collision with root package name */
    public int f4553k;

    /* renamed from: l, reason: collision with root package name */
    public int f4554l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f4555m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4556n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f4553k + ", mGapDir=" + this.f4554l + ", mHasUnwantedGapAfter=" + this.f4556n + ", mGapPerSpan=" + Arrays.toString(this.f4555m) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f4553k);
        parcel.writeInt(this.f4554l);
        parcel.writeInt(this.f4556n ? 1 : 0);
        int[] iArr = this.f4555m;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f4555m);
        }
    }
}
