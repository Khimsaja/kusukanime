package io.github.jan.supabase.postgrest.query.filter;

import V3.a;
import kotlin.Metadata;
import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/postgrest/query/filter/TextSearchType;", "", "identifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "NONE", "PLAINTO", "PHRASETO", "WEBSEARCH", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextSearchType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TextSearchType[] $VALUES;
    private final String identifier;
    public static final TextSearchType NONE = new TextSearchType("NONE", 0, "");
    public static final TextSearchType PLAINTO = new TextSearchType("PLAINTO", 1, "pl");
    public static final TextSearchType PHRASETO = new TextSearchType("PHRASETO", 2, "ph");
    public static final TextSearchType WEBSEARCH = new TextSearchType("WEBSEARCH", 3, "w");

    private static final /* synthetic */ TextSearchType[] $values() {
        return new TextSearchType[]{NONE, PLAINTO, PHRASETO, WEBSEARCH};
    }

    static {
        TextSearchType[] textSearchTypeArr$values = $values();
        $VALUES = textSearchTypeArr$values;
        $ENTRIES = AbstractC1420H.z(textSearchTypeArr$values);
    }

    private TextSearchType(String str, int i7, String str2) {
        this.identifier = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static TextSearchType valueOf(String str) {
        return (TextSearchType) Enum.valueOf(TextSearchType.class, str);
    }

    public static TextSearchType[] values() {
        return (TextSearchType[]) $VALUES.clone();
    }

    public final String getIdentifier() {
        return this.identifier;
    }
}
