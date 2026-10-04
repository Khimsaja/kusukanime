package C3;

import A3.C0006a;
import A3.C0007b;
import O.C0509o0;
import O.C0510p;
import W.f;
import X0.q;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.kusukanime.data.SocialPrefs;
import e4.InterfaceC0821a;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class a {
    public static final W.a a = new W.a(false, 1919668535, new C0006a(10));

    /* renamed from: b, reason: collision with root package name */
    public static final W.a f952b = new W.a(false, 1745898993, new C0006a(11));

    /* renamed from: c, reason: collision with root package name */
    public static final W.a f953c = new W.a(false, 1645841990, new C0007b(16));

    /* renamed from: d, reason: collision with root package name */
    public static final W.a f954d = new W.a(false, -429092205, new C0007b(17));

    public static final void a(InterfaceC0821a interfaceC0821a, InterfaceC0821a interfaceC0821a2, InterfaceC0821a interfaceC0821a3, C0510p c0510p, int i7) {
        c0510p.T(-1240705247);
        int i8 = (c0510p.h(interfaceC0821a) ? 4 : 2) | i7 | (c0510p.h(interfaceC0821a2) ? 32 : 16) | (c0510p.h(interfaceC0821a3) ? 256 : 128);
        if ((i8 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            android.support.v4.media.session.b.a(interfaceC0821a3, new q(4), f.b(533899128, new b(interfaceC0821a, interfaceC0821a3, interfaceC0821a2), c0510p), c0510p, ((i8 >> 6) & 14) | 432);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new b(interfaceC0821a, interfaceC0821a2, interfaceC0821a3, i7);
        }
    }

    public static final void b(Context context) {
        l.f("ctx", context);
        Uri uri = Uri.parse(SocialPrefs.TELEGRAM_URL);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setPackage("org.telegram.messenger");
            intent.addFlags(268435456);
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                context.startActivity(new Intent("android.intent.action.VIEW", uri).addFlags(268435456));
            }
        } catch (Throwable unused2) {
        }
    }
}
