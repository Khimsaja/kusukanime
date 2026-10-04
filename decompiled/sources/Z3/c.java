package Z3;

import java.io.File;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f10249b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f10250c;

    /* renamed from: d, reason: collision with root package name */
    public int f10251d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f10253f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, File file) {
        super(file);
        this.f10253f = fVar;
    }

    @Override // Z3.g
    public final File a() {
        boolean z7 = this.f10252e;
        File file = this.a;
        f fVar = this.f10253f;
        if (!z7 && this.f10250c == null) {
            fVar.f10260n.getClass();
            File[] fileArrListFiles = file.listFiles();
            this.f10250c = fileArrListFiles;
            if (fileArrListFiles == null) {
                fVar.f10260n.getClass();
                this.f10252e = true;
            }
        }
        File[] fileArr = this.f10250c;
        if (fileArr != null && this.f10251d < fileArr.length) {
            l.c(fileArr);
            int i7 = this.f10251d;
            this.f10251d = i7 + 1;
            return fileArr[i7];
        }
        if (this.f10249b) {
            fVar.f10260n.getClass();
            return null;
        }
        this.f10249b = true;
        return file;
    }
}
