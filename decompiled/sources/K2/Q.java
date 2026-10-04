package K2;

import android.os.Parcel;
import android.os.Parcelable;
import o1.AbstractC1632b;

/* loaded from: classes.dex */
public final class Q extends AbstractC1632b {
    public static final Parcelable.Creator<Q> CREATOR = new P(0);

    /* renamed from: m, reason: collision with root package name */
    public Parcelable f4499m;

    public Q(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4499m = parcel.readParcelable(classLoader == null ? H.class.getClassLoader() : classLoader);
    }

    @Override // o1.AbstractC1632b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeParcelable(this.f4499m, 0);
    }
}
