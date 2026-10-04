package androidx.versionedparcelable;

import G2.C0175l;
import Q2.b;
import Q2.c;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0175l(4);

    /* renamed from: k, reason: collision with root package name */
    public final c f10897k;

    public ParcelImpl(Parcel parcel) {
        this.f10897k = new b(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new b(parcel).l(this.f10897k);
    }
}
