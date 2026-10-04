package O;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: O.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0491f0 implements Parcelable.ClassLoaderCreator {
    public static C0493g0 a(Parcel parcel, ClassLoader classLoader) {
        T t7;
        if (classLoader == null) {
            classLoader = C0491f0.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i7 = parcel.readInt();
        if (i7 == 0) {
            t7 = T.f7046m;
        } else if (i7 == 1) {
            t7 = T.f7049p;
        } else {
            if (i7 != 2) {
                throw new IllegalStateException(v.c0.a(i7, "Unsupported MutableState policy ", " was restored"));
            }
            t7 = T.f7047n;
        }
        return new C0493g0(value, t7);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new C0493g0[i7];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
