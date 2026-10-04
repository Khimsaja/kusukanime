package io.github.jan.supabase.auth;

import P3.r;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"SESSION_REFRESH_THRESHOLD", "", "SIGNOUT_IGNORE_CODES", "", "", "getSIGNOUT_IGNORE_CODES$annotations", "()V", "auth-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthImplKt {
    private static final double SESSION_REFRESH_THRESHOLD = 0.8d;
    private static final List<Integer> SIGNOUT_IGNORE_CODES = r.I(401, 403, 404);

    private static /* synthetic */ void getSIGNOUT_IGNORE_CODES$annotations() {
    }
}
