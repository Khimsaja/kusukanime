package K2;

import android.os.Parcel;
import android.os.Parcelable;
import o1.AbstractC1632b;

/* loaded from: classes.dex */
public final class P implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ P(int i7) {
        this.a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new Q(parcel, null);
            default:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC1632b.f13554l;
                }
                throw new IllegalStateException("superState must be null");
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new Q[i7];
            default:
                return new AbstractC1632b[i7];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new Q(parcel, classLoader);
            default:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC1632b.f13554l;
                }
                throw new IllegalStateException("superState must be null");
        }
    }
}
