package io.github.jan.supabase.auth;

import kotlin.Metadata;
import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/github/jan/supabase/auth/FlowType;", "", "<init>", "(Ljava/lang/String;I)V", "IMPLICIT", "PKCE", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FlowType {
    private static final /* synthetic */ V3.a $ENTRIES;
    private static final /* synthetic */ FlowType[] $VALUES;
    public static final FlowType IMPLICIT = new FlowType("IMPLICIT", 0);
    public static final FlowType PKCE = new FlowType("PKCE", 1);

    private static final /* synthetic */ FlowType[] $values() {
        return new FlowType[]{IMPLICIT, PKCE};
    }

    static {
        FlowType[] flowTypeArr$values = $values();
        $VALUES = flowTypeArr$values;
        $ENTRIES = AbstractC1420H.z(flowTypeArr$values);
    }

    private FlowType(String str, int i7) {
    }

    public static V3.a getEntries() {
        return $ENTRIES;
    }

    public static FlowType valueOf(String str) {
        return (FlowType) Enum.valueOf(FlowType.class, str);
    }

    public static FlowType[] values() {
        return (FlowType[]) $VALUES.clone();
    }
}
