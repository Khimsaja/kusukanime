package z0;

import K5.C0332k;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.kusukanime.R;
import f1.AbstractC0871d;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class k1 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final K5.W a(Context context) {
        K5.W w7;
        LinkedHashMap linkedHashMap = a;
        synchronized (linkedHashMap) {
            try {
                Object objL = linkedHashMap.get(context);
                if (objL == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    J5.e eVarA = P3.F.a(-1, 6, null);
                    C0332k c0332k = new C0332k(new i1(contentResolver, uriFor, new j1(eVarA, AbstractC0871d.M(Looper.getMainLooper())), eVarA, context, null));
                    H5.v0 v0VarE = H5.D.e();
                    O5.e eVar = H5.M.a;
                    objL = K5.N.l(c0332k, new M5.c(P3.F.M(v0VarE, M5.m.a)), new K5.V(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objL);
                }
                w7 = (K5.W) objL;
            } catch (Throwable th) {
                throw th;
            }
        }
        return w7;
    }

    public static final O.r b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof O.r) {
            return (O.r) tag;
        }
        return null;
    }
}
