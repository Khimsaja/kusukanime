package Q1;

import B1.K;
import O1.g0;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import io.ktor.client.utils.CIOKt;
import java.util.Map;
import java.util.Objects;
import v.c0;
import y1.V;

/* loaded from: classes.dex */
public final class j extends V {

    /* renamed from: D, reason: collision with root package name */
    public static final j f7890D = new j(new i());

    /* renamed from: A, reason: collision with root package name */
    public final boolean f7891A;

    /* renamed from: B, reason: collision with root package name */
    public final SparseArray f7892B;

    /* renamed from: C, reason: collision with root package name */
    public final SparseBooleanArray f7893C;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f7894u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f7895v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f7896w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f7897x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f7898y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f7899z;

    static {
        c0.d(CIOKt.DEFAULT_HTTP_POOL_SIZE, 1001, 1002, 1003, 1004);
        c0.d(1005, 1006, 1007, 1008, 1009);
        c0.d(1010, 1011, 1012, 1013, 1014);
        K.B(1015);
        K.B(1016);
        K.B(1017);
        K.B(1018);
    }

    public j(i iVar) {
        super(iVar);
        this.f7894u = iVar.f7884u;
        this.f7895v = iVar.f7885v;
        this.f7896w = iVar.f7886w;
        this.f7897x = iVar.f7887x;
        this.f7898y = iVar.f7888y;
        this.f7899z = iVar.f7889z;
        this.f7891A = iVar.f7881A;
        this.f7892B = iVar.f7882B;
        this.f7893C = iVar.f7883C;
    }

    @Override // y1.V
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (super.equals(jVar) && this.f7894u == jVar.f7894u && this.f7895v == jVar.f7895v && this.f7896w == jVar.f7896w && this.f7897x == jVar.f7897x && this.f7898y == jVar.f7898y && this.f7899z == jVar.f7899z && this.f7891A == jVar.f7891A) {
                SparseBooleanArray sparseBooleanArray = this.f7893C;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = jVar.f7893C;
                if (sparseBooleanArray2.size() == size) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            SparseArray sparseArray = this.f7892B;
                            int size2 = sparseArray.size();
                            SparseArray sparseArray2 = jVar.f7892B;
                            if (sparseArray2.size() == size2) {
                                for (int i8 = 0; i8 < size2; i8++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i8));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i8);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                g0 g0Var = (g0) entry.getKey();
                                                if (!map2.containsKey(g0Var) || !Objects.equals(entry.getValue(), map2.get(g0Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i7)) < 0) {
                                break;
                            }
                            i7++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // y1.V
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f7894u ? 1 : 0)) * 961) + (this.f7895v ? 1 : 0)) * 961) + (this.f7896w ? 1 : 0)) * 28629151) + (this.f7897x ? 1 : 0)) * 31) + (this.f7898y ? 1 : 0)) * 31) + (this.f7899z ? 1 : 0)) * 961) + (this.f7891A ? 1 : 0)) * 31;
    }
}
