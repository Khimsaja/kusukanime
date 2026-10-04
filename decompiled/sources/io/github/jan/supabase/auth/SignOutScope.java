package io.github.jan.supabase.auth;

import kotlin.Metadata;
import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/SignOutScope;", "", "<init>", "(Ljava/lang/String;I)V", "GLOBAL", "LOCAL", "OTHERS", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SignOutScope {
    private static final /* synthetic */ V3.a $ENTRIES;
    private static final /* synthetic */ SignOutScope[] $VALUES;
    public static final SignOutScope GLOBAL = new SignOutScope("GLOBAL", 0);
    public static final SignOutScope LOCAL = new SignOutScope("LOCAL", 1);
    public static final SignOutScope OTHERS = new SignOutScope("OTHERS", 2);

    private static final /* synthetic */ SignOutScope[] $values() {
        return new SignOutScope[]{GLOBAL, LOCAL, OTHERS};
    }

    static {
        SignOutScope[] signOutScopeArr$values = $values();
        $VALUES = signOutScopeArr$values;
        $ENTRIES = AbstractC1420H.z(signOutScopeArr$values);
    }

    private SignOutScope(String str, int i7) {
    }

    public static V3.a getEntries() {
        return $ENTRIES;
    }

    public static SignOutScope valueOf(String str) {
        return (SignOutScope) Enum.valueOf(SignOutScope.class, str);
    }

    public static SignOutScope[] values() {
        return (SignOutScope[]) $VALUES.clone();
    }
}
