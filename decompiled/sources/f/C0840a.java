package f;

import G2.C0175l;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.l;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0840a implements Parcelable {
    public static final Parcelable.Creator<C0840a> CREATOR = new C0175l(11);

    /* renamed from: k, reason: collision with root package name */
    public final int f11377k;

    /* renamed from: l, reason: collision with root package name */
    public final Intent f11378l;

    public C0840a(Intent intent, int i7) {
        this.f11377k = i7;
        this.f11378l = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i7 = this.f11377k;
        sb.append(i7 != -1 ? i7 != 0 ? String.valueOf(i7) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f11378l);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        l.f("dest", parcel);
        parcel.writeInt(this.f11377k);
        Intent intent = this.f11378l;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i7);
        }
    }
}
