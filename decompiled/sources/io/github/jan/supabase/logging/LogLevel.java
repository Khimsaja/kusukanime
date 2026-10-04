package io.github.jan.supabase.logging;

import V3.a;
import kotlin.Metadata;
import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/github/jan/supabase/logging/LogLevel;", "", "<init>", "(Ljava/lang/String;I)V", "DEBUG", "INFO", "WARNING", "ERROR", "NONE", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LogLevel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LogLevel[] $VALUES;
    public static final LogLevel DEBUG = new LogLevel("DEBUG", 0);
    public static final LogLevel INFO = new LogLevel("INFO", 1);
    public static final LogLevel WARNING = new LogLevel("WARNING", 2);
    public static final LogLevel ERROR = new LogLevel("ERROR", 3);
    public static final LogLevel NONE = new LogLevel("NONE", 4);

    private static final /* synthetic */ LogLevel[] $values() {
        return new LogLevel[]{DEBUG, INFO, WARNING, ERROR, NONE};
    }

    static {
        LogLevel[] logLevelArr$values = $values();
        $VALUES = logLevelArr$values;
        $ENTRIES = AbstractC1420H.z(logLevelArr$values);
    }

    private LogLevel(String str, int i7) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }
}
