package g;

import P3.q;
import P3.y;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0928a {
    public static final C0928a a = new C0928a();

    public Uri a(Intent intent, int i7) {
        List arrayList;
        if (i7 != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data != null) {
            return data;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data2 = intent.getData();
        if (data2 != null) {
            linkedHashSet.add(data2);
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null && linkedHashSet.isEmpty()) {
            arrayList = y.f7779k;
        } else {
            if (clipData != null) {
                int itemCount = clipData.getItemCount();
                for (int i8 = 0; i8 < itemCount; i8++) {
                    Uri uri = clipData.getItemAt(i8).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            arrayList = new ArrayList(linkedHashSet);
        }
        return (Uri) q.t0(arrayList);
    }
}
