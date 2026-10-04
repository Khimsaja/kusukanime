package a3;

import P3.q;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import d3.C0801m;
import f6.C0922t;
import g3.AbstractC0946e;
import io.ktor.util.GzipHeaderFlags;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0662a {
    public final /* synthetic */ int a;

    public /* synthetic */ C0662a(int i7) {
        this.a = i7;
    }

    public final Object a(Object obj, C0801m c0801m) throws PackageManager.NameNotFoundException {
        String scheme;
        String authority;
        switch (this.a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (!AbstractC0946e.c(uri) && ((scheme = uri.getScheme()) == null || scheme.equals("file"))) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = "";
                    }
                    if (AbstractC2510o.x0(path, '/') && ((String) q.t0(uri.getPathSegments())) != null) {
                        if (!l.a(uri.getScheme(), "file")) {
                            return new File(uri.toString());
                        }
                        String path2 = uri.getPath();
                        if (path2 != null) {
                            return new File(path2);
                        }
                    }
                }
                return null;
            case 2:
                return ((C0922t) obj).f11612i;
            case 3:
                Context context = c0801m.a;
                int iIntValue = ((Number) obj).intValue();
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            case GzipHeaderFlags.EXTRA /* 4 */:
                Uri uri2 = (Uri) obj;
                if (!l.a(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || AbstractC2510o.g0(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                if (authority2 == null) {
                    authority2 = "";
                }
                Resources resourcesForApplication = c0801m.a.getPackageManager().getResourcesForApplication(authority2);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                if (identifier == 0) {
                    throw new IllegalStateException(("Invalid android.resource URI: " + uri2).toString());
                }
                return Uri.parse("android.resource://" + authority2 + '/' + identifier);
            default:
                return Uri.parse((String) obj);
        }
    }
}
