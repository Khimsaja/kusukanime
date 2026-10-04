package com.kusukanime;

import D3.w;
import H5.D;
import H5.M;
import H5.v0;
import M5.c;
import O.C0493g0;
import O5.d;
import O5.e;
import P3.F;
import W.a;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.b;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import c.n;
import com.kusukanime.data.CrashLog;
import com.kusukanime.data.SbClient;
import d.AbstractC0772f;
import io.github.jan.supabase.SupabaseClient;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import o3.AbstractC1634a;
import o3.C1636c;
import o3.C1637d;
import z0.C2453k0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014¨\u0006\r"}, d2 = {"Lcom/kusukanime/MainActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onNewIntent", "", "intent", "Landroid/content/Intent;", "handleOAuthCallback", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MainActivity extends n {
    public static final C1636c Companion = new C1636c();

    /* renamed from: D, reason: collision with root package name */
    public static final c f11167D;

    static {
        v0 v0VarE = D.e();
        e eVar = M.a;
        f11167D = D.c(F.M(v0VarE, d.f7623l));
    }

    public final void i(Intent intent) {
        Uri data;
        if (intent == null || (data = intent.getData()) == null || !l.a(data.getHost(), "login-callback")) {
            return;
        }
        try {
            String string = data.toString();
            l.e("toString(...)", string);
            Pattern patternCompile = Pattern.compile("access_token=[^&#]+");
            l.e("compile(...)", patternCompile);
            String strReplaceAll = patternCompile.matcher(string).replaceAll("access_token=<MASK>");
            l.e("replaceAll(...)", strReplaceAll);
            Pattern patternCompile2 = Pattern.compile("refresh_token=[^&#]+");
            l.e("compile(...)", patternCompile2);
            String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("refresh_token=<MASK>");
            l.e("replaceAll(...)", strReplaceAll2);
            Pattern patternCompile3 = Pattern.compile("provider_token=[^&#]+");
            l.e("compile(...)", patternCompile3);
            String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll("provider_token=<MASK>");
            l.e("replaceAll(...)", strReplaceAll3);
            CrashLog.INSTANCE.saveDiag(this, "oauth-callback shape (panjang=" + string.length() + ")\n" + strReplaceAll3);
        } catch (Throwable unused) {
        }
        try {
            SupabaseClient orNull = SbClient.INSTANCE.getOrNull();
            if (orNull == null) {
                return;
            }
            c cVar = f11167D;
            e eVar = M.a;
            D.x(cVar, d.f7623l, new C1637d(data, this, orNull, null), 2);
        } catch (Throwable unused2) {
        }
    }

    @Override // c.n, a1.AbstractActivityC0658b, android.app.Activity
    public final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        i(getIntent());
        SharedPreferences sharedPreferences = getSharedPreferences("kusu_settings", 0);
        C0493g0 c0493g0 = w.a;
        w.a.setValue(Boolean.valueOf(sharedPreferences.getBoolean("dark", true)));
        a aVar = AbstractC1634a.f13598c;
        ViewGroup.LayoutParams layoutParams = AbstractC0772f.a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        C2453k0 c2453k0 = childAt instanceof C2453k0 ? (C2453k0) childAt : null;
        if (c2453k0 != null) {
            c2453k0.setParentCompositionContext(null);
            c2453k0.setContent(aVar);
            return;
        }
        C2453k0 c2453k02 = new C2453k0(this);
        c2453k02.setParentCompositionContext(null);
        c2453k02.setContent(aVar);
        View decorView = getWindow().getDecorView();
        if (J.e(decorView) == null) {
            J.i(decorView, this);
        }
        if (J.f(decorView) == null) {
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (b.t(decorView) == null) {
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(c2453k02, AbstractC0772f.a);
    }

    @Override // c.n, android.app.Activity
    public final void onNewIntent(Intent intent) {
        l.f("intent", intent);
        super.onNewIntent(intent);
        setIntent(intent);
        i(intent);
    }
}
