package g1;

import F5.o;
import K2.d0;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import l4.AbstractC1420H;
import n6.m;

/* renamed from: g1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0935c {
    public static final d0 a = new d0(2);

    /* renamed from: b, reason: collision with root package name */
    public static final B2.e f11674b = new B2.e(16);

    public static o a(Context context, List list) {
        m.m("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < list.size(); i7++) {
                C0936d c0936d = (C0936d) list.get(i7);
                ProviderInfo providerInfoB = b(context.getPackageManager(), c0936d, context.getResources());
                if (providerInfoB == null) {
                    return new o(6, (byte) 0);
                }
                arrayList.add(c(context, c0936d, providerInfoB.authority));
            }
            return new o(6, arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, C0936d c0936d, Resources resources) {
        m.m("FontProvider.getProvider");
        try {
            List listI = c0936d.f11677d;
            String str = c0936d.a;
            String str2 = c0936d.f11675b;
            if (listI == null) {
                listI = AbstractC1420H.I(resources, 0);
            }
            C0934b c0934b = new C0934b();
            c0934b.a = str;
            c0934b.f11672b = str2;
            c0934b.f11673c = listI;
            d0 d0Var = a;
            ProviderInfo providerInfo = (ProviderInfo) d0Var.g(c0934b);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            B2.e eVar = f11674b;
            Collections.sort(arrayList, eVar);
            for (int i7 = 0; i7 < listI.size(); i7++) {
                ArrayList arrayList2 = new ArrayList((Collection) listI.get(i7));
                Collections.sort(arrayList2, eVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i8 = 0; i8 < arrayList.size(); i8++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i8), (byte[]) arrayList2.get(i8))) {
                            break;
                        }
                    }
                    d0Var.k(c0934b, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static i[] c(Context context, C0936d c0936d, String str) {
        m.m("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                m.m("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {c0936d.f11676c};
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e7) {
                            Log.w("FontsProvider", "Unable to query the content provider", e7);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i7 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new i(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i7));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    return (i[]) arrayList.toArray(new i[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }
}
