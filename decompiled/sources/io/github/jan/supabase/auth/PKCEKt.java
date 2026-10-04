package io.github.jan.supabase.auth;

import a4.C0665c;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import p.I0;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"generateCodeVerifier", "", "generateCodeChallenge", "codeVerifier", "auth-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PKCEKt {
    public static final String generateCodeChallenge(String str) throws NoSuchAlgorithmException {
        l.f("codeVerifier", str);
        w6.l lVar = w6.l.f17157n;
        w6.l lVarC = I0.x(AbstractC2517v.K(str), -1234567890).c("SHA-256");
        C0665c.f10439e.getClass();
        return AbstractC2517v.R(C0665c.a(C0665c.f10441g, lVarC.q()), "=", "");
    }

    public static final String generateCodeVerifier() {
        byte[] bArr = new byte[64];
        y6.a.a.nextBytes(bArr);
        C0665c.f10439e.getClass();
        return C0665c.a(C0665c.f10441g, bArr);
    }
}
