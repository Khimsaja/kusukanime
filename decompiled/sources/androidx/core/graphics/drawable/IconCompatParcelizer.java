package androidx.core.graphics.drawable;

import Q2.a;
import Q2.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.util.GzipHeaderFlags;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = aVar.f(iconCompat.a, 1);
        byte[] bArr = iconCompat.f10688c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f7947e;
            int i7 = parcel.readInt();
            if (i7 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i7];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f10688c = bArr;
        iconCompat.f10689d = aVar.g(iconCompat.f10689d, 3);
        iconCompat.f10690e = aVar.f(iconCompat.f10690e, 4);
        iconCompat.f10691f = aVar.f(iconCompat.f10691f, 5);
        iconCompat.f10692g = (ColorStateList) aVar.g(iconCompat.f10692g, 6);
        String string = iconCompat.f10694i;
        if (aVar.e(7)) {
            string = ((b) aVar).f7947e.readString();
        }
        iconCompat.f10694i = string;
        String string2 = iconCompat.f10695j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f7947e.readString();
        }
        iconCompat.f10695j = string2;
        iconCompat.f10693h = PorterDuff.Mode.valueOf(iconCompat.f10694i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.f10689d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f10687b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f10689d;
                if (parcelable2 != null) {
                    iconCompat.f10687b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f10688c;
                iconCompat.f10687b = bArr3;
                iconCompat.a = 3;
                iconCompat.f10690e = 0;
                iconCompat.f10691f = bArr3.length;
                return iconCompat;
            case 2:
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 6:
                String str = new String(iconCompat.f10688c, Charset.forName("UTF-16"));
                iconCompat.f10687b = str;
                if (iconCompat.a == 2 && iconCompat.f10695j == null) {
                    iconCompat.f10695j = str.split(ServerSentEventKt.COLON, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f10687b = iconCompat.f10688c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f10694i = iconCompat.f10693h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.f10689d = (Parcelable) iconCompat.f10687b;
                break;
            case 1:
            case 5:
                iconCompat.f10689d = (Parcelable) iconCompat.f10687b;
                break;
            case 2:
                iconCompat.f10688c = ((String) iconCompat.f10687b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f10688c = (byte[]) iconCompat.f10687b;
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 6:
                iconCompat.f10688c = iconCompat.f10687b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i7 = iconCompat.a;
        if (-1 != i7) {
            aVar.j(i7, 1);
        }
        byte[] bArr = iconCompat.f10688c;
        if (bArr != null) {
            aVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f7947e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f10689d;
        if (parcelable != null) {
            aVar.k(parcelable, 3);
        }
        int i8 = iconCompat.f10690e;
        if (i8 != 0) {
            aVar.j(i8, 4);
        }
        int i9 = iconCompat.f10691f;
        if (i9 != 0) {
            aVar.j(i9, 5);
        }
        ColorStateList colorStateList = iconCompat.f10692g;
        if (colorStateList != null) {
            aVar.k(colorStateList, 6);
        }
        String str = iconCompat.f10694i;
        if (str != null) {
            aVar.i(7);
            ((b) aVar).f7947e.writeString(str);
        }
        String str2 = iconCompat.f10695j;
        if (str2 != null) {
            aVar.i(8);
            ((b) aVar).f7947e.writeString(str2);
        }
    }
}
