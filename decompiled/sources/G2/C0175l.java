package G2;

import G2.C0175l;
import K2.C0317v;
import K2.b0;
import K2.c0;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.versionedparcelable.ParcelImpl;
import b.BinderC0698c;
import b.C0696a;
import b.C0699d;
import b.InterfaceC0697b;
import b3.C0710b;
import f.C0840a;
import f.C0846g;
import io.ktor.util.GzipHeaderFlags;
import java.util.LinkedHashMap;

/* renamed from: G2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175l implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ C0175l(int i7) {
        this.a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Bundle bundle = null;
        InterfaceC0697b interfaceC0697b = null;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.l.f("inParcel", parcel);
                return new C0176m(parcel);
            case 1:
                C0317v c0317v = new C0317v();
                c0317v.f4687k = parcel.readInt();
                c0317v.f4688l = parcel.readInt();
                c0317v.f4689m = parcel.readInt() == 1;
                return c0317v;
            case 2:
                b0 b0Var = new b0();
                b0Var.f4553k = parcel.readInt();
                b0Var.f4554l = parcel.readInt();
                b0Var.f4556n = parcel.readInt() == 1;
                int i7 = parcel.readInt();
                if (i7 > 0) {
                    int[] iArr = new int[i7];
                    b0Var.f4555m = iArr;
                    parcel.readIntArray(iArr);
                }
                return b0Var;
            case 3:
                c0 c0Var = new c0();
                c0Var.f4560k = parcel.readInt();
                c0Var.f4561l = parcel.readInt();
                int i8 = parcel.readInt();
                c0Var.f4562m = i8;
                if (i8 > 0) {
                    int[] iArr2 = new int[i8];
                    c0Var.f4563n = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i9 = parcel.readInt();
                c0Var.f4564o = i9;
                if (i9 > 0) {
                    int[] iArr3 = new int[i9];
                    c0Var.f4565p = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c0Var.f4567r = parcel.readInt() == 1;
                c0Var.f4568s = parcel.readInt() == 1;
                c0Var.f4569t = parcel.readInt() == 1;
                c0Var.f4566q = parcel.readArrayList(b0.class.getClassLoader());
                return c0Var;
            case GzipHeaderFlags.EXTRA /* 4 */:
                return new ParcelImpl(parcel);
            case 5:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0175l(5);

                    /* renamed from: k, reason: collision with root package name */
                    public final int f10494k;

                    /* renamed from: l, reason: collision with root package name */
                    public final MediaDescriptionCompat f10495l;

                    {
                        this.f10494k = parcel.readInt();
                        this.f10495l = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f10494k + ", mDescription=" + this.f10495l + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i10) {
                        parcel2.writeInt(this.f10494k);
                        this.f10495l.writeToParcel(parcel2, i10);
                    }
                };
            case 6:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strG = android.support.v4.media.a.g(mediaDescription);
                CharSequence charSequenceI = android.support.v4.media.a.i(mediaDescription);
                CharSequence charSequenceH = android.support.v4.media.a.h(mediaDescription);
                CharSequence charSequenceC = android.support.v4.media.a.c(mediaDescription);
                Bitmap bitmapE = android.support.v4.media.a.e(mediaDescription);
                Uri uriF = android.support.v4.media.a.f(mediaDescription);
                Bundle bundleD = android.support.v4.media.a.d(mediaDescription);
                if (bundleD != null) {
                    bundleD = android.support.v4.media.session.b.N(bundleD);
                }
                Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriA == null) {
                    bundle = bundleD;
                } else if (!bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleD.size() != 2) {
                    bundleD.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleD;
                }
                if (uriA == null) {
                    uriA = android.support.v4.media.b.a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
                mediaDescriptionCompat.f10504s = mediaDescription;
                return mediaDescriptionCompat;
            case 7:
                return new MediaMetadataCompat(parcel);
            case 8:
                return new RatingCompat(parcel.readFloat(), parcel.readInt());
            case 9:
                C0699d c0699d = new C0699d();
                IBinder strongBinder = parcel.readStrongBinder();
                int i10 = BinderC0698c.f10899c;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC0697b.a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0697b)) {
                        C0696a c0696a = new C0696a();
                        c0696a.f10898b = strongBinder;
                        interfaceC0697b = c0696a;
                    } else {
                        interfaceC0697b = (InterfaceC0697b) iInterfaceQueryLocalInterface;
                    }
                }
                c0699d.f10901k = interfaceC0697b;
                return c0699d;
            case 10:
                String string = parcel.readString();
                kotlin.jvm.internal.l.c(string);
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 < i11; i12++) {
                    String string2 = parcel.readString();
                    kotlin.jvm.internal.l.c(string2);
                    String string3 = parcel.readString();
                    kotlin.jvm.internal.l.c(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new C0710b(linkedHashMap, string);
            case 11:
                kotlin.jvm.internal.l.f("parcel", parcel);
                return new C0840a(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            default:
                kotlin.jvm.internal.l.f("inParcel", parcel);
                return new C0846g(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new C0176m[i7];
            case 1:
                return new C0317v[i7];
            case 2:
                return new b0[i7];
            case 3:
                return new c0[i7];
            case GzipHeaderFlags.EXTRA /* 4 */:
                return new ParcelImpl[i7];
            case 5:
                return new MediaBrowserCompat$MediaItem[i7];
            case 6:
                return new MediaDescriptionCompat[i7];
            case 7:
                return new MediaMetadataCompat[i7];
            case 8:
                return new RatingCompat[i7];
            case 9:
                return new C0699d[i7];
            case 10:
                return new C0710b[i7];
            case 11:
                return new C0840a[i7];
            default:
                return new C0846g[i7];
        }
    }
}
