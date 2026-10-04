package io.github.jan.supabase.auth.mfa;

import V3.a;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/mfa/AuthenticatorAssuranceLevel;", "", "<init>", "(Ljava/lang/String;I)V", "AAL1", "AAL2", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthenticatorAssuranceLevel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AuthenticatorAssuranceLevel[] $VALUES;
    public static final AuthenticatorAssuranceLevel AAL1 = new AuthenticatorAssuranceLevel("AAL1", 0);
    public static final AuthenticatorAssuranceLevel AAL2 = new AuthenticatorAssuranceLevel("AAL2", 1);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/github/jan/supabase/auth/mfa/AuthenticatorAssuranceLevel$Companion;", "", "<init>", "()V", "from", "Lio/github/jan/supabase/auth/mfa/AuthenticatorAssuranceLevel;", "value", "", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final AuthenticatorAssuranceLevel from(String value) {
            l.f("value", value);
            if (value.equals("aal1")) {
                return AuthenticatorAssuranceLevel.AAL1;
            }
            if (value.equals("aal2")) {
                return AuthenticatorAssuranceLevel.AAL2;
            }
            throw new IllegalArgumentException("Unknown AuthenticatorAssuranceLevel: ".concat(value));
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ AuthenticatorAssuranceLevel[] $values() {
        return new AuthenticatorAssuranceLevel[]{AAL1, AAL2};
    }

    static {
        AuthenticatorAssuranceLevel[] authenticatorAssuranceLevelArr$values = $values();
        $VALUES = authenticatorAssuranceLevelArr$values;
        $ENTRIES = AbstractC1420H.z(authenticatorAssuranceLevelArr$values);
        INSTANCE = new Companion(null);
    }

    private AuthenticatorAssuranceLevel(String str, int i7) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static AuthenticatorAssuranceLevel valueOf(String str) {
        return (AuthenticatorAssuranceLevel) Enum.valueOf(AuthenticatorAssuranceLevel.class, str);
    }

    public static AuthenticatorAssuranceLevel[] values() {
        return (AuthenticatorAssuranceLevel[]) $VALUES.clone();
    }
}
