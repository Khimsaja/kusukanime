package io.github.jan.supabase.postgrest.query.filter;

import V3.a;
import kotlin.Metadata;
import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lio/github/jan/supabase/postgrest/query/filter/FilterOperator;", "", "identifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "EQ", "NEQ", "GT", "GTE", "LT", "LTE", "LIKE", "MATCH", "ILIKE", "IMATCH", "IS", "IN", "CS", "CD", "SL", "SR", "NXL", "NXR", "ADJ", "OV", "FTS", "PLFTS", "PHFTS", "WFTS", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FilterOperator {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FilterOperator[] $VALUES;
    private final String identifier;
    public static final FilterOperator EQ = new FilterOperator("EQ", 0, "eq");
    public static final FilterOperator NEQ = new FilterOperator("NEQ", 1, "neq");
    public static final FilterOperator GT = new FilterOperator("GT", 2, "gt");
    public static final FilterOperator GTE = new FilterOperator("GTE", 3, "gte");
    public static final FilterOperator LT = new FilterOperator("LT", 4, "lt");
    public static final FilterOperator LTE = new FilterOperator("LTE", 5, "lte");
    public static final FilterOperator LIKE = new FilterOperator("LIKE", 6, "like");
    public static final FilterOperator MATCH = new FilterOperator("MATCH", 7, "match");
    public static final FilterOperator ILIKE = new FilterOperator("ILIKE", 8, "ilike");
    public static final FilterOperator IMATCH = new FilterOperator("IMATCH", 9, "imatch");
    public static final FilterOperator IS = new FilterOperator("IS", 10, "is");
    public static final FilterOperator IN = new FilterOperator("IN", 11, "in");
    public static final FilterOperator CS = new FilterOperator("CS", 12, "cs");
    public static final FilterOperator CD = new FilterOperator("CD", 13, "cd");
    public static final FilterOperator SL = new FilterOperator("SL", 14, "sl");
    public static final FilterOperator SR = new FilterOperator("SR", 15, "sr");
    public static final FilterOperator NXL = new FilterOperator("NXL", 16, "nxl");
    public static final FilterOperator NXR = new FilterOperator("NXR", 17, "nxr");
    public static final FilterOperator ADJ = new FilterOperator("ADJ", 18, "adj");
    public static final FilterOperator OV = new FilterOperator("OV", 19, "ov");
    public static final FilterOperator FTS = new FilterOperator("FTS", 20, "fts");
    public static final FilterOperator PLFTS = new FilterOperator("PLFTS", 21, "plfts");
    public static final FilterOperator PHFTS = new FilterOperator("PHFTS", 22, "phfts");
    public static final FilterOperator WFTS = new FilterOperator("WFTS", 23, "wfts");

    private static final /* synthetic */ FilterOperator[] $values() {
        return new FilterOperator[]{EQ, NEQ, GT, GTE, LT, LTE, LIKE, MATCH, ILIKE, IMATCH, IS, IN, CS, CD, SL, SR, NXL, NXR, ADJ, OV, FTS, PLFTS, PHFTS, WFTS};
    }

    static {
        FilterOperator[] filterOperatorArr$values = $values();
        $VALUES = filterOperatorArr$values;
        $ENTRIES = AbstractC1420H.z(filterOperatorArr$values);
    }

    private FilterOperator(String str, int i7, String str2) {
        this.identifier = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static FilterOperator valueOf(String str) {
        return (FilterOperator) Enum.valueOf(FilterOperator.class, str);
    }

    public static FilterOperator[] values() {
        return (FilterOperator[]) $VALUES.clone();
    }

    public final String getIdentifier() {
        return this.identifier;
    }
}
