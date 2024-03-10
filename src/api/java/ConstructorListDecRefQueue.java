package com.microsoft.z3legacy;

public class ConstructorListDecRefQueue extends IDecRefQueue<ConstructorList> {
    public ConstructorListDecRefQueue() {
        super();
    }

    @Override
    protected void decRef(Context ctx, long obj) {
        Native.delConstructorList(ctx.nCtx(), obj);
    }
}
