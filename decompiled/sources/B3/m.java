package B3;

import H5.D;
import K5.Y;
import O.Z;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import androidx.lifecycle.J;
import androidx.lifecycle.O;
import com.kusukanime.data.CrashLog;
import com.kusukanime.data.OtaInfo;
import e4.InterfaceC0821a;
import io.ktor.util.GzipHeaderFlags;
import java.io.File;
import r3.C1871a;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f501k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f502l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f503m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f504n;

    public /* synthetic */ m(Z z7, Z z8, Z z9) {
        this.f501k = 2;
        this.f503m = z7;
        this.f502l = z8;
        this.f504n = z9;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f501k) {
            case 0:
                ((Z) this.f503m).setValue(Boolean.FALSE);
                u uVar = new u((InterfaceC0821a) this.f504n, 0);
                C c2 = (C) this.f502l;
                D.x(J.h(c2), null, new A(c2, uVar, null), 3);
                break;
            case 1:
                CrashLog crashLog = CrashLog.INSTANCE;
                crashLog.clear((Context) this.f504n);
                C c4 = (C) this.f502l;
                Context context = c4.f435l;
                if (context != null) {
                    Integer numValueOf = Integer.valueOf(crashLog.list(context).size());
                    Y y7 = c4.f433j;
                    y7.getClass();
                    y7.i(null, numValueOf);
                }
                ((Z) this.f503m).setValue(Boolean.FALSE);
                break;
            case 2:
                ((Z) this.f503m).setValue("");
                ((Z) this.f502l).setValue(Boolean.FALSE);
                ((Z) this.f504n).setValue(null);
                break;
            case 3:
                String str = (String) ((Z) this.f503m).getValue();
                C1871a c1871a = new C1871a(7, (Z) this.f504n);
                w3.j jVar = (w3.j) this.f502l;
                kotlin.jvm.internal.l.f("username", str);
                if (!((Boolean) jVar.f16990l.getValue()).booleanValue()) {
                    D.x(J.h(jVar), null, new w3.i(jVar, str, c1871a, null), 3);
                }
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                CrashLog crashLog2 = CrashLog.INSTANCE;
                crashLog2.clear((Context) this.f502l);
                w3.y yVar = (w3.y) this.f504n;
                Context context2 = yVar.f17091s;
                if (context2 != null) {
                    Integer numValueOf2 = Integer.valueOf(crashLog2.list(context2).size());
                    Y y8 = yVar.f17088p;
                    y8.getClass();
                    y8.i(null, numValueOf2);
                }
                ((Z) this.f503m).setValue(Boolean.FALSE);
                break;
            case 5:
                ((Z) this.f503m).setValue(Boolean.FALSE);
                u uVar2 = new u((InterfaceC0821a) this.f504n, 8);
                w3.y yVar2 = (w3.y) this.f502l;
                D.x(J.h(yVar2), null, new w3.x(yVar2, uVar2, null), 3);
                break;
            case 6:
                OtaInfo otaInfo = (OtaInfo) this.f504n;
                String download_url = otaInfo.getDownload_url();
                String version_name = otaInfo.getVersion_name();
                x3.h hVar = (x3.h) this.f502l;
                Context context3 = (Context) this.f503m;
                kotlin.jvm.internal.l.f("ctx", context3);
                kotlin.jvm.internal.l.f("url", download_url);
                kotlin.jvm.internal.l.f("versionName", version_name);
                D.x(J.h(hVar), null, new x3.f(hVar, version_name, download_url, context3, null), 3);
                break;
            default:
                Context context4 = (Context) this.f502l;
                File file = (File) ((Z) this.f503m).getValue();
                kotlin.jvm.internal.l.c(file);
                try {
                    if (file.exists()) {
                        Uri uriD = FileProvider.d(context4, context4.getPackageName() + ".provider", file);
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setDataAndType(uriD, "application/vnd.android.package-archive");
                        intent.addFlags(1);
                        intent.addFlags(268435456);
                        context4.startActivity(intent);
                    }
                } catch (Exception unused) {
                }
                ((x3.h) this.f504n).f();
                break;
        }
        return O3.C.a;
    }

    public /* synthetic */ m(Context context, C c2, Z z7) {
        this.f501k = 1;
        this.f504n = context;
        this.f502l = c2;
        this.f503m = z7;
    }

    public /* synthetic */ m(Context context, O o7, Z z7, int i7) {
        this.f501k = i7;
        this.f502l = context;
        this.f504n = o7;
        this.f503m = z7;
    }

    public /* synthetic */ m(O o7, Object obj, Object obj2, int i7) {
        this.f501k = i7;
        this.f502l = o7;
        this.f503m = obj;
        this.f504n = obj2;
    }
}
