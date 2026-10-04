package androidx.core.app;

import Q2.a;
import Q2.b;
import Q2.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarH = remoteActionCompat.a;
        boolean z7 = true;
        if (aVar.e(1)) {
            cVarH = aVar.h();
        }
        remoteActionCompat.a = (IconCompat) cVarH;
        CharSequence charSequence = remoteActionCompat.f10675b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f7947e);
        }
        remoteActionCompat.f10675b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f10676c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f7947e);
        }
        remoteActionCompat.f10676c = charSequence2;
        remoteActionCompat.f10677d = (PendingIntent) aVar.g(remoteActionCompat.f10677d, 4);
        boolean z8 = remoteActionCompat.f10678e;
        if (aVar.e(5)) {
            z8 = ((b) aVar).f7947e.readInt() != 0;
        }
        remoteActionCompat.f10678e = z8;
        boolean z9 = remoteActionCompat.f10679f;
        if (!aVar.e(6)) {
            z7 = z9;
        } else if (((b) aVar).f7947e.readInt() == 0) {
            z7 = false;
        }
        remoteActionCompat.f10679f = z7;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        aVar.i(1);
        aVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f10675b;
        aVar.i(2);
        Parcel parcel = ((b) aVar).f7947e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f10676c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        aVar.k(remoteActionCompat.f10677d, 4);
        boolean z7 = remoteActionCompat.f10678e;
        aVar.i(5);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = remoteActionCompat.f10679f;
        aVar.i(6);
        parcel.writeInt(z8 ? 1 : 0);
    }
}
