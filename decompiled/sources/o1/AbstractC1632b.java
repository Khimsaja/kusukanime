package o1;

import K2.P;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1632b implements Parcelable {

    /* renamed from: k, reason: collision with root package name */
    public final Parcelable f13555k;

    /* renamed from: l, reason: collision with root package name */
    public static final C1631a f13554l = new C1631a();
    public static final Parcelable.Creator<AbstractC1632b> CREATOR = new P(1);

    public AbstractC1632b() {
        this.f13555k = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f13555k, i7);
    }

    public AbstractC1632b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f13555k = parcelable == f13554l ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC1632b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f13555k = parcelable == null ? f13554l : parcelable;
    }
}
