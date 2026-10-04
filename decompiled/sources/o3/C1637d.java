package o3;

import H5.A;
import O3.C;
import android.net.Uri;
import com.kusukanime.MainActivity;
import e4.n;
import io.github.jan.supabase.SupabaseClient;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import z5.AbstractC2510o;

/* renamed from: o3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1637d extends U3.j implements n {

    /* renamed from: k, reason: collision with root package name */
    public int f13602k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Uri f13603l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MainActivity f13604m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ SupabaseClient f13605n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1637d(Uri uri, MainActivity mainActivity, SupabaseClient supabaseClient, S3.c cVar) {
        super(2, cVar);
        this.f13603l = uri;
        this.f13604m = mainActivity;
        this.f13605n = supabaseClient;
    }

    public static final void b(LinkedHashMap linkedHashMap, String str) {
        Iterator it = AbstractC2510o.u0(str, new String[]{"&"}, 0, 6).iterator();
        while (it.hasNext()) {
            List listU0 = AbstractC2510o.u0((String) it.next(), new String[]{"="}, 2, 2);
            if (listU0.size() == 2 && !AbstractC2510o.g0((CharSequence) listU0.get(0))) {
                String string = AbstractC2510o.J0((String) listU0.get(0)).toString();
                if (!linkedHashMap.containsKey(string)) {
                    linkedHashMap.put(string, Uri.decode((String) listU0.get(1)));
                }
            }
        }
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1637d(this.f13603l, this.f13604m, this.f13605n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1637d) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0134, code lost:
    
        if (io.github.jan.supabase.auth.Auth.exchangeCodeForSession$default(r0, r4, false, r15, 2, null) == r6) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #2 {all -> 0x0029, blocks: (B:75:0x013a, B:77:0x0140, B:79:0x0147, B:12:0x0022, B:59:0x0107, B:61:0x010b, B:64:0x0115, B:17:0x002f, B:18:0x0047, B:20:0x004d, B:22:0x0059, B:23:0x005d, B:25:0x0065, B:28:0x006f, B:33:0x0079, B:34:0x007c, B:36:0x0084, B:41:0x00ac, B:43:0x00b6, B:44:0x00bc, B:46:0x00c6, B:47:0x00cc, B:49:0x00e4, B:53:0x00ed, B:56:0x00f4, B:67:0x011c, B:80:0x014a, B:83:0x0169, B:38:0x008a, B:40:0x009f, B:6:0x0012, B:73:0x0137, B:70:0x0123), top: B:94:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0115 A[Catch: all -> 0x0029, TRY_ENTER, TryCatch #2 {all -> 0x0029, blocks: (B:75:0x013a, B:77:0x0140, B:79:0x0147, B:12:0x0022, B:59:0x0107, B:61:0x010b, B:64:0x0115, B:17:0x002f, B:18:0x0047, B:20:0x004d, B:22:0x0059, B:23:0x005d, B:25:0x0065, B:28:0x006f, B:33:0x0079, B:34:0x007c, B:36:0x0084, B:41:0x00ac, B:43:0x00b6, B:44:0x00bc, B:46:0x00c6, B:47:0x00cc, B:49:0x00e4, B:53:0x00ed, B:56:0x00f4, B:67:0x011c, B:80:0x014a, B:83:0x0169, B:38:0x008a, B:40:0x009f, B:6:0x0012, B:73:0x0137, B:70:0x0123), top: B:94:0x000c, inners: #1 }] */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.C1637d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
